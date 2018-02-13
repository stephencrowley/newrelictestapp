$(document).ready(function() {
        $('#userName').blur(function(event) {
                var name = $('#userName').val();
                var birthdate = $('#datepicker').val();
                $.get('GetUserServlet', {
                        userName : name,
                        userdate : birthdate
                }, function(responseText) {
                        $('#ajaxGetUserServletResponse').text(responseText);
                });
        });
});
