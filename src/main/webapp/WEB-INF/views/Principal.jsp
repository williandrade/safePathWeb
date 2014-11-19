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
			
      </div>
    </div>
  </div>
</div>


<%@include file="Rodape.jsp"%>


