package desafio_dio_poo;

public class Curso extends Conteudo {
	 private int cargaHoraria;
	 
	 @Override
		public double calcularXp() {
			return XP_PADRAO * cargaHoraria;
		}
	 
	 public Curso() {
		 
	 }
	 
	 
	 
	
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	@Override
	public String toString() {
		return "Mentoria [" +
				"titulo= '" + getTitulo() + '\'' +
				", descricao='" + getDescricao() + '\'' +
				", data=" + cargaHoraria +
				']';
	}
	 
}
