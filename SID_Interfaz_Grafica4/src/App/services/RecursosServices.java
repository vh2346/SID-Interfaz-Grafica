package App.services;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.border.Border;

public class RecursosServices {
	
	private Color colorpIzquierda, colorPrincipal, colorPrincipal2,colorGeneral;
	private Font fontPrincipal, fontTitulo, fontSubtitulo,fontSubtitulo2;
	private Cursor cMano;
	private Border bPrincipal,bInferior;
	private ImageIcon iCerrar;
	private static RecursosServices servicio;
	private RecursosServices() {
		 generarFuentes();
		crearColores();
		crearFuentes();
		crearCursores();
		crearBordes();
		crearImagenes();
	}
	 public void crearColores() {
			colorGeneral= new Color(255,255,255);
			colorpIzquierda = new Color(240,242,245);
			colorPrincipal = new Color(24,119,242);
			colorPrincipal2 = new Color (66,183,42);
	 }
	 public void crearFuentes() {

			fontPrincipal =new Font("Klavika-Bold",Font.BOLD ,75);
			fontTitulo =new Font("Klavika",Font.PLAIN ,22);
			fontSubtitulo =new Font("Klavika",Font.PLAIN ,15);
			fontSubtitulo2 =new Font("Klavika",Font.BOLD ,15);
	 }
	 public void crearCursores() {
		 cMano = new Cursor(Cursor.HAND_CURSOR);
	 }
	 public void crearBordes() {
		 bPrincipal = BorderFactory.createRaisedBevelBorder();
			bInferior= BorderFactory.createLineBorder(colorpIzquierda,2,true);
	 }
	 public void crearImagenes() {
		 iCerrar = new ImageIcon ("resources/images/iCerrar.png");
	 }
	 public Color getColorGeneral () {
		 return colorGeneral;
	 }
	 public Color getColorpIzquierda () {
		 return colorpIzquierda;
	 }
	 public Color getColorPrincipal () {
		 return colorPrincipal;
	 }
	 public Color getColorPrincipal2 () {
		 return colorPrincipal2;
	 }
	 public Font getFontPrincipal () {
		 return fontPrincipal;
	 }
	 public Font getFontTitulo () {
		 return fontTitulo;
	 }
	 public Font getFontSubtitulo () {
		 return fontSubtitulo;
	 }
	 public Font getFontSubtitulo2 () {
		 return fontSubtitulo2;
	 }
	 public Cursor getCMano(){ 
		 return cMano;
		 }

	 public Border getBorderbPrincipal(){ 
		 return bPrincipal;
		 }
	 
	 public Border getBorderbInferior(){ 
		 return bInferior;
		 }
	 public ImageIcon getICerrar(){ 
		 return iCerrar;
		 }
	 private void generarFuentes() {
		  try {
		    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		    ge.registerFont( Font.createFont(
		        Font.TRUETYPE_FONT,
		        new File("resources/fonts/klavika-bold.otf")
		    ));
		  } catch (IOException | FontFormatException e) {
		    System.out.println(e);
		  }
		}
	 public static RecursosServices getService() {
		    if (servicio == null) servicio = new RecursosServices();
		    return servicio;
		  }
}
