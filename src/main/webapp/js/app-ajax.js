$(document).ready(function() {
        $('#userName').blur(function(event) {
                var name = $('#userName').val();
                var birthdate = $('#datepicker').val();
                $.get('GetUserServlet', {
                        userName : name,
                        userDate : birthdate
                }, function(responseText) {
                        $('#ajaxGetUserServletResponse').text(responseText);
                });
                console.log(userName)
                console.log(userDate)
                
        });
});
