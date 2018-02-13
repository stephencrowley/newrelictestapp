$(document).ready(function() {
        $('#datepicker').change(function(event) {
                //var name = $('#datepicker').val(); //$('#userName').val()
                $.get('GetUserServlet', {
                        datepicker : name
                }, function(responseText) {
                        $('#ajaxGetUserServletResponse').text(responseText);
                });
                
        });
});
