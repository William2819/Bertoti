public class Controller implements VeiculoInterface{

	View view;
	Subject model;
	
	public Controller(Subject mo){
		this.model = mo;
		view = new View(model, this);
		view.createView();
		view.desabilitarBotaoCancelar();
		
	}
	
	public void assinar(){
		
		model.registerObserver(view);
		System.out.println("Assinatura da concessionaria com sucesso!");
		view.desabilitarBotaoAssinar();
		view.habilitarBotaoCancelar();
		
	}
	
	public void cancelar(){
		
		model.removeObserver(view);
		System.out.println("Assinatura cancelada");
		view.desabilitarBotaoCancelar();
		view.habilitarBotaoAssinar();
		
	}

	@Override
	public void comprar() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'comprar'");
	}

	@Override
	public void vender() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'vender'");
	}
	
}