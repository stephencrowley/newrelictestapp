$(document).ready(function() {
        $('#userName').blur(function(event) {
                var name = $('#userName').val() +" " +$('#datepicker').val();
                $.get('GetUserServlet', {
                        userName : name
                }, function(responseText) {
                        $('#ajaxGetUserServletResponse').text(responseText);
                });
                alert( "Load was performed " + name);
                
        });
});
