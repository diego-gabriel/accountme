function sync(tab){
	chrome.tabs.sendMessage(tab.id, { name: "get_reservations" });
}

function goToBooking(){
	var newUrl = "https://admin.booking.com/hotel/hoteladmin/extranet_ng/manage/search_reservations.html?lang=es";
	chrome.tabs.update({ url: newUrl });
}

function onCurrentTab(callback){
	chrome.tabs.query({
		active: true
	}, function(tabs){
		callback(tabs[0]);
	});
}

$(function(){

	onCurrentTab(function(tab){
		$("#sync-btn").click(function(){
			sync(tab);
		});

		$("#go-btn").click(goToBooking);		
	});

	chrome.runtime.onMessage.addListener(function(request, sender, sendResponse){
		api.call({
			endpoint: "/reception/booking",
			method: "post",
			params: request,
			callback: function(json){
				onCurrentTab(function(tab){
					chrome.tabs.sendMessage(tab.id, {
						name: "update_sync_state",
						obj: json
					})
				});
			}
		});
	});

});