package semillero.pruebaUnitaria;



import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.enums.EstadoEnum;
import com.hbt.semillero.enums.TematicaEnum;

import junit.framework.Assert;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.testng.annotations.BeforeTest;   
/**
 * 
 * <b>Descripción:<b> Clase que determina las pruebas unitarias de la clase comics
 * <b>Caso de Uso:<b> 
 * @author Angie
 * @version
 */
public class CreacionComicTest {
	
	
	
	/**
	 * Constante que contendra el log de la clase AritmeticaTest
	 */
	private final static Logger log = Logger.getLogger(OperacionesAritmeticasTest.class);
	

	
	/**
	 * 
	 * Metodo encargado de crear comics
	 * <b>Caso de Uso</b>
	 * @author Angie
	 * 
	 * @return
	 */
	static ArrayList<ComicDTO> crearcomics() {
		
		ArrayList<ComicDTO> listcomic = new ArrayList<ComicDTO>();
		listcomic.add(new ComicDTO(4L,"Tower of God","Panini",TematicaEnum.CIENCIA_FICCION,"Limitada",500,new BigDecimal(50000),"Siu",true,LocalDate.now(),EstadoEnum.ACTIVO,10));
		listcomic.add(new ComicDTO(5L,"Watchmen","Panini",TematicaEnum.HORROR,"Limitada",100,new BigDecimal(60000),"Neil",true,LocalDate.now(),EstadoEnum.ACTIVO,15));
		listcomic.add(new ComicDTO(6L,"Maus","Art Spiegelman",TematicaEnum.AVENTURAS,"Limitada",100,new BigDecimal(60000),"Spiegelman",true,LocalDate.now(),EstadoEnum.ACTIVO,25));
		listcomic.add(new ComicDTO(7L,"V de Vendetta","Panini",TematicaEnum.HORROR,"Amazones",150,new BigDecimal(70000),"Neil",true,LocalDate.now(),EstadoEnum.ACTIVO,10));
		listcomic.add(new ComicDTO(8L,"Contrato con Dios","Panini",TematicaEnum.BELICO,"Amazones",300,new BigDecimal(50000),"Will",false,LocalDate.now(),EstadoEnum.ACTIVO,9));

		listcomic.add(new ComicDTO(9L,"Akira","Amazones",TematicaEnum.FANTASTICO,"Limitada",160,new BigDecimal(40000),"Katsuhiro",true,LocalDate.now(),EstadoEnum.INACTIVO,35));
		listcomic.add(new ComicDTO(10L,"Daredevil","Amazones",TematicaEnum.CIENCIA_FICCION,"Limitada",160,new BigDecimal(40000),"Katsuhiro",true,LocalDate.now(),EstadoEnum.INACTIVO,35));
		listcomic.add(new ComicDTO(11L,"Los surcos del azar","Amazones",TematicaEnum.HUMORISTICO,"Limitada",160,new BigDecimal(40000),"Katsuhiro",true,LocalDate.now(),EstadoEnum.INACTIVO,35));
		listcomic.add(new ComicDTO(12L,"13 Rue del percebe","Amazones",TematicaEnum.DEPORTIVO,"Limitada",160,new BigDecimal(40000),"Katsuhiro",true,LocalDate.now(),EstadoEnum.INACTIVO,35));
		listcomic.add(new ComicDTO(13L,"El Incal","Amazones",TematicaEnum.FANTASTICO,"Limitada",160,new BigDecimal(40000),"Katsuhiro",true,LocalDate.now(),EstadoEnum.INACTIVO,35));

		return listcomic;

	}
	
	/**
	 * 
	 * Metodo encargado de retornar los comics Activos
	 * <b>Caso de Uso</b>
	 * @author Angie
	 * 
	 * @param lista
	 * @return
	 */
	private static ArrayList<ComicDTO> comicActivo(ArrayList<ComicDTO> lista ) {
		ArrayList<ComicDTO> comicsActivos = new ArrayList<ComicDTO>();
		
		for (int i = 0; i < lista.size(); i++) {
			
			if (lista.get(i).getEstado().equals(EstadoEnum.ACTIVO)) {
				comicsActivos.add(lista.get(i));				
			}
		}
		
		return comicsActivos;
	}
	
	/**
	 * 
	 * Metodo encargado de retornar los comics inactivos
	 * <b>Caso de Uso</b>
	 * @author Angie
	 * 
	 * @param lista
	 * @return
	 */
	
	private static ArrayList<ComicDTO> comicInactivo(ArrayList<ComicDTO> lista ) {
		ArrayList<ComicDTO> comicsInactivos = new ArrayList<ComicDTO>();
		ArrayList<String> nombres = new ArrayList<String>(); 
		
		for (int i = 0; i <lista.size(); i++) {
			if (lista.get(i).getEstado().equals(EstadoEnum.INACTIVO)) {
				comicsInactivos.add(lista.get(i));				
			}
		}
		
		for(ComicDTO comic : comicsInactivos) {
			nombres.add(comic.getNombre());
			
		}
		
		System.out.println("Se ha detectado que de " + lista.size() + " comics se encontraron que " + (lista.size() - comicsInactivos.size())
				+ " se encuentran activos  y " + comicsInactivos.size() + " Se encuentran inactivos, los comics inactivos son: " + nombres);
		
		
		
		return comicsInactivos;
	}
	
/**
 * 
 * Metodo encargado de inicializa el logger con una configuracion basica
 * <b>Caso de Uso</b>
 * @author Angie
 *
 */
	@BeforeTest
	public void inicializar() {
		BasicConfigurator.configure(); 
		log.info(":::::::::::::::::::::::::::: INICIAN PRUEBAS UNITARIAS :::::::::::::::::::::::::::: ");
	}
	
	@Test 
	public void validarActivos() {
		log.info("Inicia ejecucion del metodovalidarActivos()");
		try {
			ArrayList<ComicDTO> lista = crearcomics();
			ArrayList<ComicDTO> listaActivos = comicActivo(lista);
			for (int i = 0; i < listaActivos.size(); i++) {
				if(listaActivos.get(i).getEstado().equals(EstadoEnum.ACTIVO)) {
					
				}
				
			}
			log.info("Finaliza la ejecucion del metodo validarActivos() sin errores");
			
		} catch (Exception e) {

			Assert.assertEquals(e.getMessage(), "El metodo falló");
			log.info("Finaliza la ejecucion del metodo validarActivos() con errores");
			
		}
		
	}
	
	
	
	
	
	/**
	 * 
	 * Metodo encargado de compilar 
	 * <b>Caso de Uso</b>
	 * @author Angie
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		//crear comics
		ArrayList<ComicDTO> lista = crearcomics();
		ArrayList<ComicDTO> inactivos  = comicInactivo(lista);
	
		/*
		for (int i = 0; i < lista.size(); i++) {
			
			System.out.println(lista.get(i).getNombre());

		}
		
		
		for(ComicDTO comic : lista) {
			System.out.println(comic.getNombre());
			
		}
	*/
		
	}	
	
	
	
	
	

}
