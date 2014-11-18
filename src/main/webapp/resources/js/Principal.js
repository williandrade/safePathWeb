var map;
var baseURL;
var locais = [];
var iterator = 0;
var markers = [];

$(document).ready(function() {

	baseURL = getBaseURL();
	
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
			map.setZoom(15);
			
			getLocais();
		}, function() {
			handleNoGeolocation(true);
		});
		google.maps.event.addListener(map, 'dblclick', function(event) {
			$('#myModal').modal('show');
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
		icon:  baseURL+'/resources/img/marker5-3.png',
		draggable : false,
		animation : google.maps.Animation.DROP
	});
	var infowindow = new google.maps.InfoWindow({
	      content: locais[iterator].descricao
	  });
	google.maps.event.addListener(marker, 'click', function() {
	    infowindow.open(map,marker);
	  });
	markers.push(marker);
	iterator++;
}

function getBaseURL() {
    var url = location.href;  // entire url including querystring - also: window.location.href;
    var baseURL = url.substring(0, url.indexOf('/', 14));


    if (baseURL.indexOf('http://localhost') != -1) {
        // Base Url for localhost
        var url = location.href;  // window.location.href;
        var pathname = location.pathname;  // window.location.pathname;
        var index1 = url.indexOf(pathname);
        var index2 = url.indexOf("/", index1 + 1);
        var baseLocalUrl = url.substr(0, index2);

        return baseLocalUrl + "/";
    }
    else {
        // Root Url for domain name
        return baseURL + "/";
    }

}