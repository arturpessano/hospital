/**
 * 
 */
package hospital;

/**
 * @author Alunos
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Criando um objeto
		Endereco end1 = new Endereco("Travessa não te interessa", "12-A", "Centro", "Porto Alegre", "RS", "0000");
		Paciente pac1 = new Paciente("Julia", "99999", "98888", end1);
		Medico med1 = new Medico("000-RS", "Geovane Mota", "0000");
		Medico med2 = new Medico("111-RS", "Maria Eduarda", "1111");
		Internacao inter1 = new Internacao(pac1, med1);
        med1.setEndereco(end1);
		
		// Popular os dados
		end1.setBairro("Centro");
		end1.setCEP("0000");
		end1.setCidade("Porto Alegre");
		end1.setEstado("RS");
		end1.setNumero("12-A");
		end1.setRua("Travessa não te interessa");

		pac1.setEndereco(end1);

		// Imprimir dados
//		System.out.printf("O senhor %s reside no endereco %s nº %s no bairro %s - %s / %s", pac1.getNomeCompleto(),end1.getRua(), end1.getNumero(), end1.getBairro(), end1.getCidade(), end1.getEstado());

		System.out.println(inter1.toString());
	}

}
