package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ent.Persona;

public class AccesoDatos {

    private static String useDB = "USE ad2425_asuarez;";

    /**
     * Función que obtiene una lista de personas
     * 
     * @return Lista de personas
     */
    private static List<Persona> getPersonas() {
        List<Persona> personas = new ArrayList<>();

        personas.add(new Persona(1, "Radcliffe", "St Louis", 15));
        personas.add(new Persona(2, "Paulita", "Couthard", 82));
        personas.add(new Persona(3, "Emalia", "Bullivent", 76));
        personas.add(new Persona(4, "Shaylyn", "Dutteridge", 96));
        personas.add(new Persona(5, "Gill", "Hallyburton", 6));
        personas.add(new Persona(6, "Cornell", "Bamlett", 17));
        personas.add(new Persona(7, "Lydia", "Ianson", 34));
        personas.add(new Persona(8, "Merrie", "Linnock", 21));
        personas.add(new Persona(9, "Claudine", "Meadus", 98));
        personas.add(new Persona(10, "Amalia", "Westwater", 66));
        personas.add(new Persona(11, "Baudoin", "Guice", 85));
        personas.add(new Persona(12, "Jaye", "Ettles", 93));
        personas.add(new Persona(13, "Dagmar", "Filinkov", 49));
        personas.add(new Persona(14, "Zach", "Bonhan", 90));
        personas.add(new Persona(15, "Foster", "Waldron", 78));
        personas.add(new Persona(16, "Eugenia", "Dorn", 41));
        personas.add(new Persona(17, "Gunilla", "Ashburner", 50));
        personas.add(new Persona(18, "Sharon", "Domanek", 32));
        personas.add(new Persona(19, "Modestine", "Brosio", 38));
        personas.add(new Persona(20, "Ursola", "Attride", 88));
        personas.add(new Persona(21, "Gilburt", "Matveichev", 27));
        personas.add(new Persona(22, "Kenny", "Schruyers", 86));
        personas.add(new Persona(23, "Burtie", "Gillbey", 16));
        personas.add(new Persona(24, "Raven", "Garrettson", 99));
        personas.add(new Persona(25, "Malachi", "Mityushin", 2));
        personas.add(new Persona(26, "Eldon", "Heffernan", 16));
        personas.add(new Persona(27, "Rourke", "Fernando", 32));
        personas.add(new Persona(28, "Julio", "Ondra", 88));
        personas.add(new Persona(29, "Fred", "Frome", 24));
        personas.add(new Persona(30, "Ethelda", "Dikelin", 81));
        personas.add(new Persona(31, "Shani", "Dancer", 38));
        personas.add(new Persona(32, "Rheta", "Hauxby", 48));
        personas.add(new Persona(33, "Lilla", "Hatrick", 45));
        personas.add(new Persona(34, "Yves", "Brennan", 20));
        personas.add(new Persona(35, "Oralla", "Yurshev", 23));
        personas.add(new Persona(36, "Bank", "Stellin", 40));
        personas.add(new Persona(37, "Angie", "Dundendale", 14));
        personas.add(new Persona(38, "Erika", "Billsberry", 89));
        personas.add(new Persona(39, "Winfield", "Hakewell", 67));
        personas.add(new Persona(40, "Toddy", "Chester", 98));
        personas.add(new Persona(41, "Barbette", "Adamo", 5));
        personas.add(new Persona(42, "Maison", "O'Haire", 23));
        personas.add(new Persona(43, "Osbourn", "Vesco", 26));
        personas.add(new Persona(44, "Angie", "McLorinan", 43));
        personas.add(new Persona(45, "Leandra", "Stanmer", 92));
        personas.add(new Persona(46, "Zandra", "Smallbone", 67));
        personas.add(new Persona(47, "Joana", "Mullenger", 44));
        personas.add(new Persona(48, "Erminie", "Missenden", 59));
        personas.add(new Persona(49, "Dulcea", "Valde", 38));
        personas.add(new Persona(50, "Manfred", "Ricket", 88));
        personas.add(new Persona(51, "Samaria", "Slowgrove", 26));
        personas.add(new Persona(52, "Jethro", "Lorroway", 88));
        personas.add(new Persona(53, "Clovis", "Baxendale", 58));
        personas.add(new Persona(54, "Cicely", "Cronchey", 49));

        personas.add(new Persona(55, "Sayre", "Jindrak", 65));
        personas.add(new Persona(56, "Arlana", "Ullrich", 39));
        personas.add(new Persona(57, "Jaime", "Banasik", 97));
        personas.add(new Persona(58, "Ortensia", "Silley", 60));
        personas.add(new Persona(59, "Moina", "Franzonello", 4));
        personas.add(new Persona(60, "Nealson", "Vondrach", 63));
        personas.add(new Persona(61, "Winnifred", "Leverentz", 56));
        personas.add(new Persona(62, "Burl", "Karpfen", 47));
        personas.add(new Persona(63, "Marlene", "Dwelling", 6));
        personas.add(new Persona(64, "Mirilla", "Dimitrijevic", 26));
        personas.add(new Persona(65, "Sean", "Mazzia", 20));
        personas.add(new Persona(66, "Zebadiah", "Nissle", 80));
        personas.add(new Persona(67, "Drucill", "Sever", 90));
        personas.add(new Persona(68, "Chelsy", "Renahan", 30));
        personas.add(new Persona(69, "Frasquito", "Charley", 43));
        personas.add(new Persona(70, "Dom", "Cassells", 23));
        personas.add(new Persona(71, "Datha", "Ashbridge", 49));
        personas.add(new Persona(72, "Redford", "Simmon", 81));
        personas.add(new Persona(73, "Helene", "Jeannaud", 82));
        personas.add(new Persona(74, "Obed", "Woodyatt", 5));
        personas.add(new Persona(75, "Bess", "Ondrousek", 72));
        personas.add(new Persona(76, "Colman", "Caitlin", 63));
        personas.add(new Persona(77, "Lurlene", "Wallsam", 39));
        personas.add(new Persona(78, "Willow", "Sneath", 37));
        personas.add(new Persona(79, "Fransisco", "Geikie", 36));
        personas.add(new Persona(80, "Lorry", "Loy", 64));
        personas.add(new Persona(81, "Ros", "Howlings", 5));
        personas.add(new Persona(82, "Serene", "Heeron", 99));
        personas.add(new Persona(83, "Lucy", "Mityushin", 81));
        personas.add(new Persona(84, "Christean", "Lambersen", 32));
        personas.add(new Persona(85, "Gay", "Olenikov", 22));
        personas.add(new Persona(86, "Tedie", "Scammell", 26));
        personas.add(new Persona(87, "Torrance", "Stolworthy", 91));
        personas.add(new Persona(88, "Yale", "Kondratowicz", 74));
        personas.add(new Persona(89, "Leda", "Tarry", 90));
        personas.add(new Persona(90, "Giraud", "Line", 54));
        personas.add(new Persona(91, "Aurelia", "Canham", 76));
        personas.add(new Persona(92, "Codee", "Hamper", 90));
        personas.add(new Persona(93, "Ricky", "Huffer", 89));
        personas.add(new Persona(94, "Zora", "Millsap", 95));
        personas.add(new Persona(95, "Marline", "Futter", 99));
        personas.add(new Persona(96, "Nadiya", "Gleave", 68));
        personas.add(new Persona(97, "Mallissa", "Harkins", 56));
        personas.add(new Persona(98, "Artemus", "McClelland", 82));
        personas.add(new Persona(99, "Adam", "Skellen", 50));
        personas.add(new Persona(100, "Gabbie", "Creed", 80));

        personas.add(new Persona(101, "Cherilyn", "Ellard", 67));
        personas.add(new Persona(102, "Conrad", "Petrak", 98));
        personas.add(new Persona(103, "Dorelle", "Towe", 18));
        personas.add(new Persona(104, "Anthiathia", "Talks", 77));
        personas.add(new Persona(105, "Kathrine", "Helder", 18));
        personas.add(new Persona(106, "Nikolaus", "Kulver", 28));
        personas.add(new Persona(107, "Gabriel", "Parncutt", 19));
        personas.add(new Persona(108, "Grata", "Clineck", 69));
        personas.add(new Persona(109, "Lee", "Grishechkin", 14));
        personas.add(new Persona(110, "Homere", "Treves", 79));
        personas.add(new Persona(111, "Norrie", "Ollet", 27));
        personas.add(new Persona(112, "Durant", "Arkin", 1));
        personas.add(new Persona(113, "Fritz", "Trueman", 98));
        personas.add(new Persona(114, "Grenville", "Madelin", 71));
        personas.add(new Persona(115, "Aubry", "Mixon", 21));
        personas.add(new Persona(116, "Bryn", "Clayfield", 72));
        personas.add(new Persona(117, "Lefty", "Savaage", 89));
        personas.add(new Persona(118, "Melva", "Crock", 85));
        personas.add(new Persona(119, "Elka", "Irdale", 94));
        personas.add(new Persona(120, "Florance", "Doig", 81));
        personas.add(new Persona(121, "Reiko", "Maytom", 34));
        personas.add(new Persona(122, "Nita", "Humerstone", 32));
        personas.add(new Persona(123, "Luciano", "Patillo", 26));
        personas.add(new Persona(124, "Yule", "Slate", 66));
        personas.add(new Persona(125, "Inge", "Linner", 9));
        personas.add(new Persona(126, "Vania", "Lloyds", 82));
        personas.add(new Persona(127, "Pooh", "Maruska", 16));
        personas.add(new Persona(128, "Clemente", "Eads", 58));
        personas.add(new Persona(129, "Bunni", "Steenson", 78));
        personas.add(new Persona(130, "Freeman", "Weekes", 60));
        personas.add(new Persona(131, "Carrie", "Ridges", 97));
        personas.add(new Persona(132, "Alene", "Stanyan", 41));
        personas.add(new Persona(133, "York", "Iskow", 71));
        personas.add(new Persona(134, "Sonni", "Grevile", 76));
        personas.add(new Persona(135, "Bard", "Lennie", 31));
        personas.add(new Persona(136, "Paco", "Mariault", 91));
        personas.add(new Persona(137, "Elliot", "Longshaw", 100));
        personas.add(new Persona(138, "Hugh", "Sirman", 96));
        personas.add(new Persona(139, "Bondy", "Quinnette", 16));
        personas.add(new Persona(140, "Zach", "Kinvig", 83));
        personas.add(new Persona(141, "Grenville", "Wozencroft", 76));
        personas.add(new Persona(142, "Clemmie", "Conochie", 2));
        personas.add(new Persona(143, "Ira", "Napoleone", 83));
        personas.add(new Persona(144, "Ariadne", "D'Avaux", 52));
        personas.add(new Persona(145, "Annamarie", "Roskams", 93));
        personas.add(new Persona(146, "Phip", "Cantillon", 27));
        personas.add(new Persona(147, "Carolee", "Brassill", 45));
        personas.add(new Persona(148, "Joan", "Caudrey", 49));
        personas.add(new Persona(149, "Grover", "Marchello", 67));
        personas.add(new Persona(150, "Tiffy", "Ellson", 33));

        personas.add(new Persona(151, "Melania", "Elrick", 39));
        personas.add(new Persona(152, "Jade", "Caddell", 54));
        personas.add(new Persona(153, "Fayth", "Smye", 83));
        personas.add(new Persona(154, "Nita", "Jakobsson", 75));
        personas.add(new Persona(155, "Noby", "Ramalhete", 62));
        personas.add(new Persona(156, "Thornton", "Stainsby", 83));
        personas.add(new Persona(157, "Constantine", "Lyness", 59));
        personas.add(new Persona(158, "Burtie", "Berntsson", 24));
        personas.add(new Persona(159, "Abe", "Ronaghan", 65));
        personas.add(new Persona(160, "Rolph", "Logue", 7));
        personas.add(new Persona(161, "Richmond", "Landsbury", 100));
        personas.add(new Persona(162, "Curt", "Dignon", 12));
        personas.add(new Persona(163, "Rodolphe", "Howerd", 66));
        personas.add(new Persona(164, "Jaquith", "Hallstone", 47));
        personas.add(new Persona(165, "Dimitri", "Jarrell", 25));
        personas.add(new Persona(166, "Cami", "Risdall", 59));
        personas.add(new Persona(167, "Keri", "Jales", 14));
        personas.add(new Persona(168, "Coleman", "Smart", 39));
        personas.add(new Persona(169, "Jennica", "Leppingwell", 77));
        personas.add(new Persona(170, "Dianna", "Waywell", 61));
        personas.add(new Persona(171, "Emalee", "Bungey", 44));
        personas.add(new Persona(172, "Eunice", "Prestie", 1));
        personas.add(new Persona(173, "Diana", "Stadding", 81));
        personas.add(new Persona(174, "Aldus", "Itzcovichch", 56));
        personas.add(new Persona(175, "Nikita", "Quillinane", 32));
        personas.add(new Persona(176, "Chris", "Montier", 28));
        personas.add(new Persona(177, "Kendrick", "Cleiment", 56));
        personas.add(new Persona(178, "Abram", "Lelievre", 83));
        personas.add(new Persona(179, "Neron", "Warrack", 69));
        personas.add(new Persona(180, "Stevy", "Strettle", 1));
        personas.add(new Persona(181, "Emmaline", "Dullard", 77));
        personas.add(new Persona(182, "Tadeas", "Jakov", 1));
        personas.add(new Persona(183, "Graig", "Curman", 95));
        personas.add(new Persona(184, "Mareah", "Bon", 99));
        personas.add(new Persona(185, "Salvidor", "Gutowska", 55));
        personas.add(new Persona(186, "Christiana", "Comellini", 37));
        personas.add(new Persona(187, "Tani", "Southcomb", 71));
        personas.add(new Persona(188, "Isabel", "Hoyt", 7));
        personas.add(new Persona(189, "Maurise", "Druhan", 84));
        personas.add(new Persona(190, "Tessy", "Virr", 70));
        personas.add(new Persona(191, "Derrek", "Glynn", 47));
        personas.add(new Persona(192, "Gusti", "Silson", 7));
        personas.add(new Persona(193, "Vallie", "Girtin", 100));
        personas.add(new Persona(194, "Cilka", "MacBean", 61));
        personas.add(new Persona(195, "Albrecht", "Cowen", 79));
        personas.add(new Persona(196, "Thia", "Revely", 4));
        personas.add(new Persona(197, "Llewellyn", "deKnevet", 17));
        personas.add(new Persona(198, "Arnuad", "MacCartney", 84));
        personas.add(new Persona(199, "Carlina", "Iianon", 73));
        personas.add(new Persona(200, "Deirdre", "Quirke", 81));

        return personas;
    }

    /**
     * Función que comprueba si una tabla existe
     * 
     * @param nombreTabla Nombre de la tabla a comprobar
     * @return True si existe o false si no
     */
    public static boolean tablaExists(String nombreTabla) {
        Connection conector = null;
        Statement stmt = null;
        ResultSet rs = null;
        boolean exists = false;

        try {
            // Establecer conexión
            conector = ConexionDB.connect();

            // Crear el objeto Statement
            stmt = conector.createStatement();

            // Asegúrate de seleccionar la base de datos si es necesario
            stmt.executeUpdate(useDB); // Este paso solo es necesario si no has establecido la base de datos
                                       // previamente

            // Consulta para verificar si la tabla existe
            String checkTableSql = "SELECT 1 FROM information_schema.tables WHERE table_name = '" + nombreTabla
                    + "' AND table_schema = 'ad2425_asuarez'";

            // Ejecutar la consulta SELECT
            rs = stmt.executeQuery(checkTableSql);

            // Si hay resultados, la tabla existe
            if (rs.next()) {
                exists = true;
            }
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Cerrar recursos
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.out.println("Ha ocurrido un error cerrando los recursos");
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    System.out.println("Ha ocurrido un error cerrando los recursos");
                }
            }
            if (conector != null) {
                try {
                    conector.close();
                } catch (SQLException e) {
                    System.out.println("Ha ocurrido un error cerrando los recursos");
                }
            }
        }

        return exists;
    }

    /**
     * Función que crea la tabla Persona
     */
    public static void creacionTablaPersona() {
        Statement stmt = null;
        Connection conector = null;
        try {
            conector = ConexionDB.connect();
            // Paso 1. Creamos un nuevo objeto con la conexión
            stmt = conector.createStatement();

            // Paso 2. Seleccionar la base de datos
            stmt.executeUpdate(useDB);

            if (!tablaExists("Persona")) {
                // Paso 3. Definimos la sentencia para crear una nueva tabla
                String createTableSql = "CREATE TABLE Persona ("
                        + "id INT PRIMARY KEY,"
                        + "nombre VARCHAR(50),"
                        + "apellido VARCHAR(50),"
                        + "edad INT"
                        + ");";

                // Paso 4. Ejecutar la sentencia de creación
                stmt.executeUpdate(createTableSql);

                System.out.println("Tabla Persona creada");
            } else {
                System.out.println("La tabla persona ya existe");
            }

        } catch (SQLException se) {
            // Gestionamos los posibles errores que puedan surgir durante la ejecución
            se.printStackTrace();
        } catch (Exception e) {
            // Gestionamos los posibles errores
            e.printStackTrace();
        } finally {
            // Paso 5. Cerrar el objeto en uso y la conexión
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    System.out.println("Ha ocurrido un error cerrando los recursos");
                }
            }
            if (conector != null) {
                try {
                    conector.close();
                } catch (SQLException e) {
                    System.out.println("Ha ocurrido un error cerrando los recursos");
                }
            }
        }
    }

    /**
     * Función que inserta las personas en la tabla Persona
     */
    public static void insertarPersonas() {
        PreparedStatement stmt = null;
        Statement statement = null;
        Connection conector = null;

        try {
            conector = ConexionDB.connect();
            // Seleccionar la base de datos
            statement = conector.createStatement();
            statement.executeUpdate(useDB);

            String sql = "INSERT INTO Persona (id, nombre, apellido, edad) VALUES (?, ?, ?, ?)";

            // Obtenemos las personas
            List<Persona> personas = getPersonas();

            // Prepararemos la query para que coja los datos de manera dinamica.
            stmt = conector.prepareStatement(sql);
            for (Persona persona : personas) {
                stmt.setInt(1, persona.getId());
                stmt.setString(2, persona.getNombre());
                stmt.setString(3, persona.getApellido());
                stmt.setInt(4, persona.getEdad());
                stmt.executeUpdate();

                System.out.println(persona.getNombre() + " " + persona.getApellido() + " añadid@");
            }

        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null)
                    stmt.close();
                conector.close();
            } catch (SQLException se) {
                System.out.println("No se ha podido cerrar la conexión.");
            }
        }
    }

    /**
     * Función que realiza una consulta con campos, order y where especificado por parámetros y devuelve una lista de personas
     * @param campos Campos a obtener
     * @param order Regla order by
     * @param where Regla where
     * @return Lista de personas
     */
    public static List<Persona> getPersonasEx(String campos, String order, String where) {
        PreparedStatement stmt = null;
        Connection conector = null;
        ResultSet resultSet = null;
    
        // Lista para almacenar las personas
        List<Persona> personas = new ArrayList<>();
    
        try {
            conector = ConexionDB.connect();
            // Seleccionar la base de datos
            conector.createStatement().executeUpdate(useDB);
    
            // Construir la consulta dinámica
            String sql = "SELECT " + campos + " FROM Persona";
            if (!where.isEmpty()) {
                sql += " WHERE " + where;
            }
            if (!order.isEmpty()) {
                sql += " ORDER BY " + order;
            }
    
            // Ejecutar la consulta
            stmt = conector.prepareStatement(sql);
            resultSet = stmt.executeQuery();
    
            // Obtener metadatos para saber cuántas columnas hay
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
    
            // Procesar el resultado dinámicamente
            while (resultSet.next()) {
                Persona persona = new Persona();
    
                // Asignar valores dinámicamente
                for (int i = 1; i <= columnCount; i++) {
                    String columnName = metaData.getColumnName(i).toLowerCase();
    
                    // Asignar según el nombre de la columna
                    switch (columnName) {
                        case "id":
                            persona.setId(resultSet.getInt(i));
                            break;
                        case "nombre":
                            persona.setNombre(resultSet.getString(i));
                            break;
                        case "apellido":
                            persona.setApellido(resultSet.getString(i));
                            break;
                        case "edad":
                            persona.setEdad(resultSet.getInt(i));
                            break;
                    }
                }
    
                personas.add(persona);
            }
    
            
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conector != null) {
                    conector.close();
                }
            } catch (SQLException se) {
                System.out.println("No se ha podido cerrar la conexión.");
            }
        }
    
        return personas;
    }
    

    public static double getMediaEdad(String campos, String order, String where) {
        PreparedStatement stmt = null;
        Connection conector = null;
        ResultSet resultSet = null;
    
        double media = 0;
    
        try {
            conector = ConexionDB.connect();
            // Seleccionar la base de datos
            conector.createStatement().executeUpdate(useDB);
    
            // Construir la consulta dinámica
            String sql = "SELECT " + campos + " FROM Persona";
            if (!where.isEmpty()) {
                sql += " WHERE " + where;
            }
            if (!order.isEmpty()) {
                sql += " ORDER BY " + order;
            }
    
            // Ejecutar la consulta
            stmt = conector.prepareStatement(sql);
            resultSet = stmt.executeQuery();
    
            // Procesar el resultado dinámicamente
            while (resultSet.next()) {
                media = resultSet.getDouble(1);
            }
    
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conector != null) {
                    conector.close();
                }
            } catch (SQLException se) {
                System.out.println("No se ha podido cerrar la conexión.");
            }
        }
    
        return media;
    }

}
