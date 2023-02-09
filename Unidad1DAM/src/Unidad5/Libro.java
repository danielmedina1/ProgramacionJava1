package Unidad5;

public class Libro {

		public String ISBN;
		public String titulo;
		public String autor;
		public int numpag;
	
		
		public Libro() {
			this.ISBN = "";
			this.titulo = "";
			this.autor = "";
			this.numpag = 0;
		}

		public Libro(String ISBN, String titulo, String autor, int numpag) {
			this.ISBN = ISBN;
			this.titulo = titulo;
			this.autor = autor;
			this.numpag = numpag;
		}

		@Override
		public String toString() {
			return "El libro "+titulo+" con ISBN "+ISBN+" creado por "+autor+" tiene "+numpag+" páginas";
		}
		
		public String getISBN() {
			return ISBN;
		}
		public void setISBN(String ISBN) {
			ISBN = ISBN;
		}
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public String getAutor() {
			return autor;
		}
		public void setAutor(String autor) {
			this.autor = autor;
		}
		public int getNumpag() {
			return numpag;
		}
		public void setNumpag(int numpag) {
			this.numpag = numpag;
		}
		
		
}
