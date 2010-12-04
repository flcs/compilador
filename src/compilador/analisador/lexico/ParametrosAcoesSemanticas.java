package compilador.analisador.lexico;

import compilador.estruturas.String;

public class ParametrosAcoesSemanticas {
	
	/*
	 * Categorias de s�mbolos.
	 */
	public static final int CATEGORIA_SIMBOLO_VARIAVEL = 0;
	public static final int CATEGORIA_SIMBOLO_FUNCAO = 1;
	public static final int CATEGORIA_SIMBOLO_VETOR = 2;
	public static final int CATEGORIA_SIMBOLO_MATRIZ = 3;
	public static final int CATEGORIA_SIMBOLO_PARAMETRO = 4;
	
	/*
	 * Mapeamento de tipos de s�mbolos.
	 */
	public static final int TIPO_SIMBOLO_INT = 0;
	public static final int TIPO_SIMBOLO_CHAR = 1;
	public static final int TIPO_SIMBOLO_BOOLEAN = 2;
	public static final int TIPO_SIMBOLO_STRING = 3;
	public static final int TIPO_SIMBOLO_VOID = 4;
	
	public static Token TOKEN;			// O token referente ao s�mbolo.
	public static int TIPO;				// Tipo do s�mbolo.
	public static int CATEGORIA;		// Categoria do s�mbolo.
	public static String ENDERECO;		// Endere�o de 
	public static int TAMANHO;			// Tamanho do s�mbolo na mem�ria.
	public static boolean DECLARADO;	// Se o s�mbolo j� foi declarado.
	public static int[] PARAMETROS;		// Par�metros passados (no caso de fun��es).
	
	public static void limparParametros() {
		TOKEN = null;
		TIPO = -1;
		CATEGORIA = -1;
		ENDERECO = null;
		TAMANHO = -1;
		DECLARADO = false;
		PARAMETROS = null;
	}
}