<%@include file="Topo.jsp"%>
<script type="text/javascript"
	src="<c:url value="resources/js/Principal.js" />"></script>
<script	src="http://maps.googleapis.com/maps/api/js?key=AIzaSyCxMhpr8v4ojOhZQWFja-7BHYfgpqEbM7c&sensor=true"></script>
<div class="row" id="canvas-map">
	<div id="map-canvas"></div>
</div>

<div class="modal fade bs-example-modal-sm" id="cadastroAssalto" tabindex="-1" role="dialog" aria-labelledby="feedback-modal" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
        <h4 class="modal-title" id="myModalLabel">Adicionar Assalto</h4>
      </div>
      <div class="modal-body">
			<form class="form-horizontal" role="form" id="novoAssaltoForm">
			  <div class="form-group">
			    <label for="inputTipo" class="col-sm-2 control-label">Tipo de Assalto</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" id="tipoDeAssalto" name="tipoDeAssalto" placeholder="Tipo de Assalto">
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="inputObj" class="col-sm-2 control-label">Objetos Roubados</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" id="objRoubados" name="objRoubados" placeholder="Objetos Roubados">
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="descricao" class="col-sm-2 control-label">Descrição</label>
			    <div class="col-sm-10">
			      <textarea class="form-control" rows="3" name="descricao" placeholder="Descrição"></textarea>
			    </div>
			  </div>
			  <div class="form-group">
			    <div class="col-sm-offset-2 col-sm-10">
			      <div class="checkbox">
			        <label>
			          <input type="checkbox" name="maoArmada" value="maoArmada"> Mão Armada
			        </label>
			      </div>
			    </div>
			  </div>
			  <div class="form-group">
			    <div class="col-sm-offset-2 col-sm-10">
			        <button type="button" class="btn btn-default" data-dismiss="modal">Cancelar</button>
					<button type="submit" class="btn btn-primary">Enviar</button>
			    </div>
			  </div>
		      <input type="hidden" name="usuario" value="${usuario.getUserLogin()}"/>
			</form>
      </div>
    </div>
  </div>
</div>


<%@include file="Rodape.jsp"%>


