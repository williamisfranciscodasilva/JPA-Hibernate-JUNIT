package posjavamavenhibernate;

import java.util.List;

import org.junit.Test;

import dao.DaoGeneric;
import model.TelefoneUser;
import model.UsuarioPessoa;

public class HibernateUtilTest {
/*	@Test
	public void testeHibernateUtil() {
		//HibernateUtil.getEntityManager();
		DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>();
		UsuarioPessoa pessoa = new UsuarioPessoa();
		pessoa.setIdade(34);
		pessoa.setLogin("teste6");
		pessoa.setNome("Ana Paula da Silva");
		pessoa.setSobrenome("Lins");
		pessoa.setEmail("apaulaslins2@gmail.com");
		pessoa.setSenha("789");
		daoGeneric.salvar(pessoa);
	}*/
	/*@Test
	public void testeBuscar() {
		DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>();
		UsuarioPessoa pessoa = new UsuarioPessoa();
		pessoa.setId(4L);
		pessoa = daoGeneric.pesquisar(pessoa);
		System.out.println(pessoa);
	}*/
	/*@Test
	public void testeUpdate() {
		DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>();
		UsuarioPessoa pessoa = daoGeneric.pesquisar2(2L, UsuarioPessoa.class);
		pessoa.setIdade(88);
		pessoa.setNome("Nome atualizado no hibernate");
		pessoa = daoGeneric.updateMerge(pessoa);
		System.out.println(pessoa);
	}*/
	/*@Test
	public void testeDelete() {
		DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>();
		UsuarioPessoa pessoa = daoGeneric.pesquisar2(2L, UsuarioPessoa.class);
		daoGeneric.deletarPorId(pessoa);
	}*/
	/*@Test
	public void testeConsultar() {
		DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>();
		List<UsuarioPessoa> list = daoGeneric.listar(UsuarioPessoa.class);
		for(UsuarioPessoa usuarioPessoa : list) {
			System.out.println(usuarioPessoa);
			System.out.println("------------------------------------------------");
		}
	}*/
	/*@Test
	public void testQueryList() {
		DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>();
		List<UsuarioPessoa> list = daoGeneric.getEntityManager().createQuery(
				"from UsuarioPessoa where nome ='Williamis'").getResultList();
		for(UsuarioPessoa usuarioPessoa : list) {
			System.out.println(usuarioPessoa);
			System.out.println("------------------------------------------------");
		}
	}*/
	/*@Test
	public void testQueryListMaxResult() {
		DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>();
		List<UsuarioPessoa> list = daoGeneric.getEntityManager().createQuery(
				"from UsuarioPessoa order by id")
				.setMaxResults(7)
				.getResultList();
		for(UsuarioPessoa usuarioPessoa : list) {
			System.out.println(usuarioPessoa);
			System.out.println("------------------------------------------------");
		}
	}*/
	/*@Test
	public void testeQueryListParameter() {
		DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>();
		List<UsuarioPessoa> list = daoGeneric.getEntityManager().createQuery(
				"from UsuarioPessoa where nome = :nome")
				.setParameter("nome", "Williamis").getResultList();
		for(UsuarioPessoa usuarioPessoa : list) {
			System.out.println(usuarioPessoa);
			System.out.println("------------------------------------------------");
		}
	}*/
	/*@Test
	public void testeQueryListParameterCondition() {
		DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>();
		List<UsuarioPessoa> list = daoGeneric.getEntityManager().createQuery(
				"from UsuarioPessoa where nome = :nome or sobrenome = :sobrenome")
				.setParameter("nome", "Suzana")
				.setParameter("sobrenome", "Lins")
				.getResultList();
		for(UsuarioPessoa usuarioPessoa : list) {
			System.out.println(usuarioPessoa);
			System.out.println("------------------------------------------------");
		}
	}*/
	/*@Test
	public void testeQuerySomaIdade() {
		DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>();
		Long somaIdade = (Long) daoGeneric.getEntityManager().createQuery(
				"select sum(u.idade) from UsuarioPessoa u ").getSingleResult();
		System.out.println("Soma de todas as idades --> "+ somaIdade);
	}*/
	/*@Test
	public void testeQueryMediaIdade() {
		DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>();
		Double mediaIdade = (Double) daoGeneric.getEntityManager().createQuery(
				"select avg(u.idade) from UsuarioPessoa u ").getSingleResult();
		System.out.println("A média de todas as idades --> "+ mediaIdade);
	}*/
	/*@Test
	public void testNamedQuery1() {
		DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>();
		List<UsuarioPessoa> list = daoGeneric.getEntityManager().createNamedQuery("UsuarioPessoa.Todos").getResultList();
		for(UsuarioPessoa usuarioPessoa : list) {
			System.out.println(usuarioPessoa);
		}
	}*/
	/*@Test
	public void testNamedQuery2() {
		DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>();
		List<UsuarioPessoa> list = daoGeneric.getEntityManager()
				.createNamedQuery("UsuarioPessoa.buscaPorNome")
				.setParameter("nome", "Ana Paula")
				.getResultList();
		for(UsuarioPessoa usuarioPessoa : list) {
			System.out.println(usuarioPessoa);
		}
	}*/
	@Test
	public void testGravaTelefone() {
		DaoGeneric daoGeneric = new DaoGeneric();
		UsuarioPessoa pessoa = (UsuarioPessoa) daoGeneric.pesquisar2(5L,UsuarioPessoa.class);
		TelefoneUser telefoneUser = new TelefoneUser();
		telefoneUser.setTipo("Celular");
		telefoneUser.setNumero("856985689");
		telefoneUser.setUsuarioPessoa(pessoa);
		daoGeneric.salvar(telefoneUser);
	}
}
