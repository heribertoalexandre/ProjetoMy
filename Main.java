package Agricultural;

public class Main {
	public static void main (String agr[]) {
		
	
		// Criando os repositorios
		
		PlantRepository repositorioDePlantas = new PlantRepository ();		
		ContainerRepository repositorioDeContaines = new ContainerRepository(10);
		EmployeeRepository repositorioDeFuncionarios = new EmployeeRepository(10);
		
		
		//MANIPULANDO OS FUNCIONARIOS
		
		/*Criando Funcionarios*/
		
		Employee funcionario1 = new Employee("João","Masculino","login1","senha1",2,"Trabalhador Regular",true,937);
		Employee funcionario2 = new Employee("Lucas","Masculino","login2","senha2",2,"Trabalhador Regular",true,937);
		
		System.out.println("***Informações sobre o funcionario ***\n" );
		System.out.println(funcionario1 + "\n");
		
		/*Realizando Alterações nos Funcionarios*/
		
		System.out.println("***Atualizando dados do funcionario1*** \n");
		funcionario1.setSalary(4685);
		funcionario1.setBusinessPosition("Supervisor");
		funcionario1.setLogin("novoLogin1");
		funcionario1.setPassword("novaSenha1");
		
		System.out.println(funcionario1 + "\n");
		
		// REALIZANDO MANIPULAÇÕES NO REPOSITORIO DE FUNCIONARIOS
		
		/*Registrando Funcionarios*/
		
		repositorioDeFuncionarios.register(funcionario1);
		
		System.out.println("***Verificando se o funcionario4 estar registrado*** \n");
		System.out.println(repositorioDeFuncionarios.exist(funcionario1) + "\n");
		System.out.println("***Pesquisando pelo indice o Funcinario1*** \n");
		System.out.println("Numero do indice do funcionario: " + repositorioDeFuncionarios.searchIndex(funcionario1) + "\n");
		System.out.println("***Removendo o funcionario1*** \n" );
		repositorioDeFuncionarios.remove(funcionario1);
		System.out.println("***Verificando se o funcionario4 AINDA estar registrado*** \n");
		System.out.println(repositorioDeFuncionarios.exist(funcionario1) + "\n");
		
		
		
		// CRIANDO PLANTAS
		
		Plant tomate = new Plant("Tomate");
		Plant cebola = new Plant("Cebola");
		Plant alface = new Plant("Alface");
		
		System.out.println("***Apresentando Informações sobre as plantas*** \n");
		System.out.println(tomate + "\n");
		
		
		// REALIZANDO MANIPULAÇÕES NO REPOSITORIO DE PLANTAS
		
		/*Registrando Plantas*/
		
		repositorioDePlantas.toAdd(tomate);
		repositorioDePlantas.toAdd(cebola);
		repositorioDePlantas.toAdd(alface);
		
		System.out.println("***Verificando se a planta (tomate) estar registrada*** \n");
		System.out.println(repositorioDePlantas.exist(tomate) + "\n");
		System.out.println("***Removendo a planta (tomate)*** \n" );
		repositorioDePlantas.toRemove(tomate);
		System.out.println("***Listando todas as especies registradas*** \n");
		repositorioDePlantas.toList();
		
		//GAS
		
		/*Criando gas*/
		
		Gas gas1 = new Gas(65.0f,5.0f,15.0f,15f);
		Gas gas2 = new Gas(60.0f,3.0f,30.0f,27f);
		System.out.println("\n***Apresentando informações sobre o gás*** \n");
		System.out.println(gas1 + "\n");
		
		// CONTAINER DE PLANTAÇÃO E AMBIENTE DE PLANTAÇÃO
		
		/*Criando container*/
		
		Container containerDePlantacao = new Container();
		
		/*Criando o ambiente*/
		
		AgriculturalFloor plantacao1 = new AgriculturalFloor (1.5,24.0,gas1,50);
		
		/*Adicionando ambientes de plantações*/
		
		containerDePlantacao.addFloor(plantacao1);
			
		System.out.println("***Apresentando Informações sobre os ambientes de plantações*** \n");
		System.out.println(plantacao1 + "\n");
		
		
		/*Realizando Alterações no Ambiente de plantação*/
		plantacao1.setPressure(1);
		plantacao1.setTemperature(36);
		
		System.out.println("\n***Atualizando o ambiente de plantação1*** \n");
		System.out.println(plantacao1 + "\n");
		
		// ADICIONAR NO CONTAINER 
		//****************************
		// em obras...
		
		//STOCK
		
		Stock estoque = new Stock(1000);
		
		//PRODUCT
		
		/* Registrando produtos*/
		
		Product alfaceProduct = new Product("Alface");
		alfaceProduct.setInStock(false);
		alfaceProduct.increaseAmountOf(35);
		System.out.println("**Informações sobre o Product Alface** \n");
		System.out.println(alfaceProduct + "\n");
		
		/*Adicionando ao estoque*/
		
		
		
		
		//PORTOS
		Port port = new Port("Porto Central",1000,estoque);
				
	}
}
