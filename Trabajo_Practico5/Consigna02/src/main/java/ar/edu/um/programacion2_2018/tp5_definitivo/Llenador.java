package ar.edu.um.programacion2_2018.tp5_definitivo;
public class Llenador extends Thread {
	private ColaCaja cola;
	
	public Llenador() {
		
	}

	public Llenador(ColaCaja cola) {
		super();
		this.cola = cola;
	}
	
	public ColaCaja getCola() {
		return cola;
	}

	public void setCola(ColaCaja cola) {
		this.cola = cola;
	}

	@Override
	public void run() {
		while (true) {
			Producto prod1 = new Producto("Manteca",40);
			Producto prod2 = new Producto("Sopa",20);
			Producto prod3 = new Producto("Huevo",2);
	                Producto prod4 = new Producto("Atum",5);
	
                        Cliente cl = new Cliente(12,"Pepe");
			Cliente c2 = new Cliente(11,"Hugo");
			
                        
                        cl.getProductos().add(prod1);
			cl.getProductos().add(prod2);
                        c2.getProductos().add(prod3);
			c2.getProductos().add(prod4);

			this.cola.getClientes().add(cl);
                        this.cola.getClientes().add(c2);
		}
	}
}
