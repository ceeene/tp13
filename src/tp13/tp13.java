

package tp13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Celia
 */
public class tp13 {

    
    
    public static void main(String[] args) {
        try {
            //cargamos driver de conexion
            Class.forName("org.mariadb.jdbc.Driver");
            
            //establecemos conexion
            String URL="jdbc:mariadb://localhost:3306/universidad";
            String usuario="root";
            String password="";
            Connection con=DriverManager.getConnection(URL,usuario,password);
            
            
            //cargamos alumnos
    /*String sql="INSERT INTO alumno (dni, apellido, nombre, fechaDeNacimiento, estado)"
            + "VALUES (38516415,'Gimenez','Agustina','1995,05,05',true)";
    String sql="INSERT INTO alumno (dni, apellido, nombre, fechaDeNacimiento, estado)"
            + "VALUES (33251879,'Guzman','Leandro','1989,10,06',true)";
    String sql="INSERT INTO alumno (dni, apellido, nombre, fechaDeNacimiento, estado)"
            + "VALUES (28592815,'Ramirez','Marianela','1982,01,14',true)";*/
    
        
    //creamos objeto para enviar los datos de los alumnos
    /*PreparedStatement ps=con.prepareStatement(sql);
    int filas= ps.executeUpdate();
    if (filas>0){
        JOptionPane.showMessageDialog(null, "Alumno agregado");
        
    }*/        
               
    //agregamos materias
    /*String sql="INSERT INTO materia (asignatura,anio,estado)"
            + "VALUES ('Matematica', 2003, true)";
    String sql="INSERT INTO materia (asignatura,anio,estado)"
            + "VALUES ('Lengua', 2003, true)";
    String sql="INSERT INTO materia (asignatura,anio,estado)"
            + "VALUES ('Naturales', 2003, true)";
    String sql="INSERT INTO materia (asignatura,anio,estado)"
            + "VALUES ('Sociales', 2003, true)";*/
    
    
    
    //creamos objeto para enviar los datos de las materias
    /*PreparedStatement ps=con.prepareStatement(sql);
    int filas= ps.executeUpdate();
    if (filas>0){
        JOptionPane.showMessageDialog(null, "Materia creada");
}    */
            
    //inscribimos alumnos en materias
    /*String sql= "INSERT INTO inscripcion(nota,idAlumno,idMateria)"
            + "VALUES(9,1,1)";
    String sql= "INSERT INTO inscripcion(nota,idAlumno,idMateria)"
            + "VALUES(8,1,2)";
    String sql= "INSERT INTO inscripcion(nota,idAlumno,idMateria)"
            + "VALUES(5,2,3)";
    String sql= "INSERT INTO inscripcion(nota,idAlumno,idMateria)"
            + "VALUES(10,2,4)";
    String sql= "INSERT INTO inscripcion(nota,idAlumno,idMateria)"
            + "VALUES(3,3,1)";
    String sql= "INSERT INTO inscripcion(nota,idAlumno,idMateria)"
            + "VALUES(9,3,3)";*/
    
    
    /*//creamos objeto para enviar la inscripcion del alumno en la materia
    PreparedStatement ps=con.prepareStatement(sql);
    int filas= ps.executeUpdate();
    if (filas>0){
        JOptionPane.showMessageDialog(null, "Alumno inscripto");
}   */ 
    
    //listamos datos de alumnos con nota mayor a 8
    /*String sql="SELECT  alumno.apellido, alumno.nombre, alumno.dni, materia.asignatura, inscripcion.nota"
            + " FROM alumno "
            + "JOIN inscripcion ON (alumno.idAlumno=inscripcion.idAlumno)"
            + "JOIN materia ON (inscripcion.idMateria=materia.idMateria) "
            + "WHERE (inscripcion.nota>8)";
    PreparedStatement ps=con.prepareStatement(sql);
    ResultSet rs=ps.executeQuery();
    while(rs.next()){
        String apellido=rs.getString("apellido");
        String nombre=rs.getString("nombre");
        int dni=rs.getInt("dni");
        String asignatura=rs.getString("asignatura");
        int nota=rs.getInt("nota");
        
        //mostrar datos en consola
        System.out.println("Alumno con calificacion mayor a 8:");
        System.out.println("Nombre: "+apellido+" "+nombre);
        System.out.println("Dni "+dni);
        System.out.println("Materia: "+asignatura);
        System.out.println("Nota: "+nota);
        System.out.println("*****************************");
               
    }*/
    
    //eliminamos alumno de una materia
    String sql=" DELETE FROM inscripcion WHERE  idAlumno=1 AND idMateria=1";
    PreparedStatement ps= con.prepareStatement(sql);
    int delete= ps.executeUpdate();
    if(delete>0){
        JOptionPane.showMessageDialog(null,"Inscripcion eliminada");
    }
    
    
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Error al cargar Driver");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error de conexion");
           System.out.println("Codigo de error "+ex.getErrorCode());
        }
    }
    
    

    
    
    
}
