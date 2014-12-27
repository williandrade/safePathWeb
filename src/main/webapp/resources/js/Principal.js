var map;
var locais = [];
var iterator = 0;
var markers = [];

$(document).ready(function() {

	google.maps.event.addDomListener(window, 'load', initialize);
});

function getLocais() {
	$.ajax({
        url: "getLocais",
        type: "POST",
         
        beforeSend: function(xhr) {
            xhr.setRequestHeader("Accept", "application/json");
            xhr.setRequestHeader("Content-Type", "application/json");
        },
        success: function(resp) {
        	locais = resp;
            drop();
        }
    });
}

function initialize() {
	var mapOptions = {
		zoom : 8
	};
	map = new google.maps.Map(document.getElementById('map-canvas'), mapOptions);

	// Try HTML5 geolocation
	if (navigator.geolocation) {
		navigator.geolocation.getCurrentPosition(function(position) {
			var pos = new google.maps.LatLng(position.coords.latitude,
					position.coords.longitude);

			map.setCenter(pos);
			map.setZoom(10);
			
			getLocais();
		}, function() {
			handleNoGeolocation(true);
		});
	} else {
		// Browser doesn't support Geolocation
		handleNoGeolocation(false);
	}
}

function handleNoGeolocation(errorFlag) {
	if (errorFlag) {
		var content = 'Error: The Geolocation service failed.';
	} else {
		var content = 'Error: Your browser doesn\'t support geolocation.';
	}

	var options = {
		map : map,
		position : new google.maps.LatLng(60, 105),
		content : content
	};

	var infowindow = new google.maps.InfoWindow(options);
	map.setCenter(options.position);
}

function drop() {
	for (var i = 0; i < locais.length; i++) {
		setTimeout(function() {
			addMarker();
		}, i * 500);
	}
}

function addMarker() {
	var marker = new google.maps.Marker({
		position : new google.maps.LatLng(locais[iterator].latitude, locais[iterator].longitude),
		map : map,
		draggable : false,
		animation : google.maps.Animation.DROP
	});
	var infowindow = new google.maps.InfoWindow({
	      content: 'Teste'
	  });
	google.maps.event.addListener(marker, 'click', function() {
	    infowindow.open(map,marker);
	  });
	markers.push(marker);
	iterator++;
}