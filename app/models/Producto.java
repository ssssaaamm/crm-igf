package models;

import java.util.*;
import java.io.File;
import java.io.File;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import play.data.*;
import com.avaje.ebean.*;

@Entity
@Table(name="producto")
public class Producto extends Model{
	
	@Id
	public Long id;

	@Constraints.Required(message="Debe ingresar el codigo del producto")
	public String codigo;

	@Constraints.Required(message="Debe ingresar el nombre del producto")
	public String nombre;

	@Constraints.Required(message="Debe ingresar una descripcion")
	public String descripcion;

	@Constraints.Required(message="Debe ingresar el precio del producto")
	public double precio;

	@Constraints.Required(message="Debe ingresar una cantidad de existencias inicial")
	public int existencias;

	@ManyToOne
	public Categoria categoria;

	@Lob
	public byte[] imagen;

    public static Finder<Long, Producto> find = new Finder<Long,Producto>(Producto.class);

    public Form<Producto> getForm(){
    	Producto p = Producto.find.byId(this.id);
    	Form<Producto> returning=Form.form(Producto.class).fill(p);
    	return returning;

	}//Fin getForm
}