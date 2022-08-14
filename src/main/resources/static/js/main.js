//GET: $(document).ready(
//		function() {
//
//			// GET REQUEST
//			$("#greet").click(function(event) {
//				event.preventDefault();
//				alert("hi");
//				ajaxGet();
//			});
//
//			// DO GET
//			function ajaxGet() {
//			    alert("hi again");
//				$.ajax({
//					url : "http://localhost:5000/winners",
//					success : function(result) {
//					    alert(result);
//						$("#response").html(result);
//					}
//				});
//			}
//})