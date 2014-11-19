      </div><!-- End Page Content -->
    </div><!-- End Content Wrapper -->
  </div><!-- End Page Wrapper -->
  
<div class="modal fade bs-example-modal-sm" id="feedback-modal" tabindex="-1" role="dialog" aria-labelledby="feedback-modal" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
        <h4 class="modal-title" id="myModalLabel">FeedBack</h4>
      </div>
      <div class="modal-body">
		<form class="form-signin" id="feedBackForm">
	       <div class="form-group">
				<label for="feebackObs">Nos dê sua sugestão:</label>
				<textarea class="form-control" rows="3" name="feedbackText" placeholder="Deixe sua sugestão" required></textarea>
			</div>
			<input type="hidden" name="usuario" value="${usuario.getUserLogin()}"/>
        <button type="button" class="btn btn-default" data-dismiss="modal">Cancelar</button>
		<button type="submit" class="btn btn-primary">Enviar</button>
      	</form>
      </div>
    </div>
  </div>
</div>
  
  
</body>
</html>