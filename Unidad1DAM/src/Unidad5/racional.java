package Unidad5;

public class racional {
	private int num;
	private int den;
	
	public racional(int a, int b) {
		this.setNum(a);
		this.setDen(b);
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getDen() {
		return den;
	}
	public void setDen(int den) {
		if(den!=0) {this.den = den;}
		else {System.out.println("El denominador debe ser didtinto de cero"); this.den=1;}
		
	}
	
	public String toString() {
		return this.getNum()+"/"+this.getDen();
	}
	public racional producto(racional r) {
		int n=0;
		int d=0;
		n=this.getNum()*r.getNum();
		d=this.getDen()*r.getDen();
		//Inicio for
		for (int i = 0; i < 20; i++) {
			if(n%7==0 && d%7==0) {
				n=n/7;
				d=d/7;
			}
			else {
				if(n%5==0 && d%5==0) {
					n=n/5;
					d=d/5;
				}
				else {
					if(n%3==0 && d%3==0) {
						n=n/3;
						d=d/3;
					}
					else {
						if(n%2==0 && d%2==0) {
							n=n/2;
							d=d/2;
						}
						else {n=n; d=d;}
					}
				}
			}
		}
		//Fin del for
		racional resultado=new racional(n, d);
		return resultado;
	}
	
	public racional division(racional q) {
		int n=0;
		int d=0;
		n=this.getNum()*q.getDen();
		d=this.getDen()*q.getNum();
		//Inicio for
		for (int i = 0; i < 20; i++) {
			if(n%7==0 && d%7==0) {
				n=n/7;
				d=d/7;
			}
			else {
				if(n%5==0 && d%5==0) {
					n=n/5;
					d=d/5;
				}
				else {
					if(n%3==0 && d%3==0) {
						n=n/3;
						d=d/3;
					}
					else {
						if(n%2==0 && d%2==0) {
							n=n/2;
							d=d/2;
						}
						else {n=n; d=d;}
					}
				}
			}
		}
		//Fin del for
		racional resultado=new racional(n, d);
		return resultado;
	}

	public racional suma(racional q) {
		int n=0, d=0, z=0;
		if(this.getDen()==q.getDen()) {
			n=this.getNum()+q.getNum();
			d=this.getDen();
		}
		else {
			z=this.getDen()*q.getDen();
			n=(this.getNum()*(z/this.getDen()))+(q.getNum()*(z/q.getDen()));
			d=z;
		}
		//Inicio for
				for (int i = 0; i < 20; i++) {
					if(n%7==0 && d%7==0) {
						n=n/7;
						d=d/7;
					}
					else {
						if(n%5==0 && d%5==0) {
							n=n/5;
							d=d/5;
						}
						else {
							if(n%3==0 && d%3==0) {
								n=n/3;
								d=d/3;
							}
							else {
								if(n%2==0 && d%2==0) {
									n=n/2;
									d=d/2;
								}
								else {n=n; d=d;}
							}
						}
					}
				}
				//Fin del for
		racional resultado=new racional(n, d);
		return resultado;
	}

	public racional resta(racional q) {
		int n=0, d=0, z=0;
		if(this.getDen()==q.getDen()) {
			n=this.getNum()-q.getNum();
			d=this.getDen();
		}
		else {
			z=this.getDen()*q.getDen();
			n=(this.getNum()*(z/this.getDen()))-(q.getNum()*(z/q.getDen()));
			d=z;
		}
		
		
		for (int i = 0; i < 20; i++) {
			if(n%7==0 && d%7==0) {
				n=n/7;
				d=d/7;
			}
			else {
				if(n%5==0 && d%5==0) {
					n=n/5;
					d=d/5;
				}
				else {
					if(n%3==0 && d%3==0) {
						n=n/3;
						d=d/3;
					}
					else {
						if(n%2==0 && d%2==0) {
							n=n/2;
							d=d/2;
						}
						else {n=n; d=d;}
					}
				}
			}
		}
		//Fin del for
		racional resultado=new racional(n, d);
		return resultado;
	}
	public void simplificar(int n, int d) {
		//Inicio for
		for (int i = 0; i < 20; i++) {
			if(n%7==0 && d%7==0) {
				n=n/7;
				d=d/7;
			}
			else {
				if(n%5==0 && d%5==0) {
					n=n/5;
					d=d/5;
				}
				else {
					if(n%3==0 && d%3==0) {
						n=n/3;
						d=d/3;
					}
					else {
						if(n%2==0 && d%2==0) {
							n=n/2;
							d=d/2;
						}
						else {n=n; d=d;}
					}
				}
			}
		}
		//Fin del for
		
	}
	

	
	


}
