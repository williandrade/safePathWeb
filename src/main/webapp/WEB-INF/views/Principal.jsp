<%@include file="Topo.jsp"%>
<script type="text/javascript"
	src="<c:url value="resources/js/Principal.js" />"></script>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script
	src="http://maps.googleapis.com/maps/api/js?key=AIzaSyCxMhpr8v4ojOhZQWFja-7BHYfgpqEbM7c&sensor=true"></script>
<div class="row" id="canvas-map">
	<div id="map-canvas"></div>
<<<<<<< HEAD
	<div class="modal fade bs-example-modal-sm" id="myModal" tabindex="-1"
		role="dialog" aria-labelledby="mySmallModalLabel" aria-hidden="true">
		<div class="modal-dialog modal-sm">
=======
</div>
<div class="modal fade font-style" id="feedback-modal" tabindex="-1"
	role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<form role="form" method="POST" action="sendFeedback">
>>>>>>> FETCH_HEAD
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">
						<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
					</button>
<<<<<<< HEAD
					<h4 class="modal-title" id="myModalLabel">Modal title</h4>
				</div>
				<div class="modal-body">Teste</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					<button type="button" class="btn btn-primary">Save changes</button>
				</div>
			</div>
		</div>
=======
					<h4 class="modal-title" id="feedback-modal-title">Enviar
						feedback</h4>
				</div>
				<div class="modal-body">

					<div class="form-group">
						<label for="feebackObs">Nos dê sua sugestão:</label>
						<textarea type="text" id="feedbackText" name="feedbackText"
							class="form-control" placeholder="Deixe sua sugestão" required>
						</textarea>
					</div>

				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Cancelar</button>
					<button type="submit" class="btn btn-primary">Enviar</button>
				</div>
			</div>
		</form>
>>>>>>> FETCH_HEAD
	</div>
</div>
<%@include file="Rodape.jsp"%>


