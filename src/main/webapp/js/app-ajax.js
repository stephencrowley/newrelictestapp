$(document).ready(function() {
        $('#userName').blur(function(event) {
                var name = $('#datepicker').val(); //$('#userName').val()
                $.get('GetUserServlet', {
                        userName : name
                }, function(responseText) {
                        $('#ajaxGetUserServletResponse').text(responseText);
                });
                
        });
});
