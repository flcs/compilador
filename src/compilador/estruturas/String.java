package compilador.estruturas;

import java.util.Arrays;

import compilador.helper.ArrayHelper;

public class String {
	
	/**
	 * A sequ�ncia de caracteres que comp�em a string.
	 */
	private char[] chars;
	
	
	public String(char[] chars) {
		this.chars = new char[chars.length];
		System.arraycopy(chars, 0, this.chars, 0, this.chars.length);
	}
	
	/**
	 * @return o tamanho da string.
	 */
	public int tamanho() {
		return this.chars.length;
	}
	
	/**
	 * @return o array de chars que representa a string.
	 */
	public char[] toCharArray() {
		return this.chars;
	}
	
	public void imprimir() {
		for(int i = 0; i < this.chars.length; i++)
			System.out.print(this.chars[i]);
	}
		
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		String other = (String) obj;
		if (!ArrayHelper.compararVetoresChar(this.chars, other.toCharArray()))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(chars);
		return result;
	}
}