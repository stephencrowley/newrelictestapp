$(document).ready(function() {
        $('#datepicker').change(function(event) {
                var datePick = $('#datepicker').val(); 
                var name = $('#userName').val()
                $.get('GetUserServlet', {
                        userName : name,
                        datepicker: datePick                        
                }, function(responseText) {
                        $('#ajaxGetUserServletResponse').text(responseText);
                });
                
        });
});
