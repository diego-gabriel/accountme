function getReservationOwner(row){
	return $(row).find(".booker-name").text().trim();
}

function getReservationPax(row){
	return $(row).find(".booker-name").parent().clone().children().remove().end().text().trim().split(" ")[0];
}

function getReservationStartDate(row){
	return $($(row).find("td")[1]).attr("data-reservation-date");
}

function getReservationEndDate(row){
	return $($(row).find("td")[2]).attr("data-reservation-date");
}

function getReservationRooms(row){
	return $($(row).find("td")[3]).text().trim().split(",").map(function(cad) { return cad.trim() } );
}

function getReservationCreatedAt(row){
	return $($(row).find("td")[4]).attr("data-reservation-date");
}

function getReservationStatus(row){
	return $($(row).find("td")[5]).find(".status__general").text().trim();
}

function getReservationPrice(row){
	return $($(row).find("td")[6]).find(".price__general").text().trim().split("$")[1];
}
function getReservationFee(row){
	return $($(row).find("td")[7]).text().trim().split("$")[1].trim();
}
function getReservationReferenceNumber(row){
	return $($(row).find("td")[8]).text().trim();
}

function syncCompletedTag(){
	var tag = $("<span>Sincronizado</span>");
	tag.addClass("sync-completed");
	return tag;
}

function updateSyncState(reservation){
	console.log("update this!");
	console.log(reservation);

	var row = $("#r"+reservation.owner.reference);
	$(row.find("td")[8]).append(syncCompletedTag());

}

var room_id = {
	"Tinti Kaballu": 1,
	"Atux": 2,
	"Q'inti": 3,
	"Kayra": 4,
	"Pilpintu": 5,
	"Chayña": 6,
	"Puka-q’ellitu": 7,
	"Apartamento Dúplex": 8
}

function getReservations(){
	var table = $(".reservation-list").find("tbody");

	table.find("tr").each(function(){
		
		var pax = getReservationPax(this);
		var room_names = getReservationRooms(this);
		var created_at = getReservationCreatedAt(this);
		var status = getReservationStatus(this);
		var reference = getReservationReferenceNumber(this);

		var reservation = {
			arrival_time: 1400,
			start_date: getReservationStartDate(this),
			end_date: getReservationEndDate(this),
			special_details: "",
			status: status
		}

		var booking = {
			booker: getReservationOwner(this),
			reference: reference,
			price: getReservationPrice(this),
			fee: getReservationFee(this),
			date: created_at
		}


		var rooms = [];

		for(var i = 0; i < room_names.length; i++){
			rooms.push({
				id: room_id[room_names[i]],
				guests: []
			});
		}

		for(var i = 0, j = 0; i < pax; i++, j=(j+1)%room_names.length){
			rooms[j].guests.push({ name: "Guest "+i });
		}

		var params = {
			reservation: reservation,
			rooms: rooms,
			booking: booking
		}

		$(this).attr("id", "r"+reference);

		chrome.runtime.sendMessage(params);
	});

}

chrome.runtime.onMessage.addListener(function(event, sender, sendResponse) {
	if (event.name == "get_reservations"){
		getReservations();
	}
	if (event.name == "update_sync_state"){
		updateSyncState(event.obj);
	}
});