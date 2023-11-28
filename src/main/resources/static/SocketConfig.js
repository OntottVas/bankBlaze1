var stompClient = null;

function connect() {
    var socket = new SockJS('/bankBlaze-websocket');
    stompClient = Stomp.over(socket);
    stompClient.connect({}, function (frame) {
        stompClient.subscribe('/topic/app', function (desk) {
            // function calling
            //sendRefresh(JSON.parse(desk.body));
            showDeskTable(desk.body);
        });
    });
}

function sendRefresh(desk) {
    var id = "queueNumber" + desk.id;
    $("#" + id).text(desk.queueNumber.number);
}

function showDeskTable(desk) {
    $("#deskTable").append("<tr><td>" + desk.id + "</td><td>" + desk.queueNumber.number + "</td></tr>")
}




