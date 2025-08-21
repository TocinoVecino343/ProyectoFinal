package co.edu.unbosque.model;

public class Steam extends Publicacion {

	private String desarrolladora;
	private String editor;
	private String genero;

	public Steam() {
		super();
	}

	public Steam(String desarrolladora, String editor, String genero) {
		super();
		this.desarrolladora = desarrolladora;
		this.editor = editor;
		this.genero = genero;
	}

	public Steam(int id, String titulo, String clasificacion, String facultad, int fechaDePublicacion, String idioma,
			String desarrolladora, String editor, String genero) {
		super(id, titulo, clasificacion, facultad, fechaDePublicacion, idioma);
		this.desarrolladora = desarrolladora;
		this.editor = editor;
		this.genero = genero;
	}

	public Steam(int id, String titulo, String clasificacion, String facultad, int fechaDePublicacion, String idioma) {
		super(id, titulo, clasificacion, facultad, fechaDePublicacion, idioma);
		// TODO Auto-generated constructor stub
	}

	public String getDesarrolladora() {
		return desarrolladora;
	}

	public void setDesarrolladora(String desarrolladora) {
		this.desarrolladora = desarrolladora;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return super.toString() + " -----Steam-----" + "\nDesarrolladora: " + desarrolladora + "\nEditor: " + editor + "\nGénero: "
				+ genero;
	}

}
