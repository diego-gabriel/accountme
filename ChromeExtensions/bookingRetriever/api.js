var api = {
	host: "http://localhost:3001",
	call: function(vars){

		if (vars.params === undefined)
			vars.params = {};
		if (vars.method === undefined)
			vars.params = "get";

		if (vars.endpoint){
			$.ajax({
				url: this.host + vars.endpoint,
				method: vars.method,
				data: JSON.stringify(vars.params),
				contentType: "application/json",
				success: function(ans){
					vars.callback(ans);
				},
				error: function(request, textStatus, error){
					console.log(request);
					console.log(textStatus);
					console.log(error);

				}
			});
		} else {
			throw "No API endpoint to call to";
		}
	}
};

