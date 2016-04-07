package br.com.herbertrausch.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;

import br.com.herbertrausch.util.SpringUtil;

public class UsuarioService {

	private UsuarioRepository db;
	
	public UsuarioService (){
	
		ApplicationContext context=SpringUtil.getContext();
		db = context.getBean(UsuarioRepository.class);
	
	}
	
	public List<Usuario> getUsuario() {
		try {
			
			List<Usuario> usuarios = (List<Usuario>) db.findAll();
					
			return usuarios;
			
		} catch (Exception e) {
			e.printStackTrace();
			return new ArrayList<Usuario>();

		}
	}
	
	public List<Usuario> getByNome(String nome){
		return db.findByNome(nome);
	}
	public List<Usuario> getBySenha(String senha){
		return db.findBySenha(senha);
	}
	
	

	public Usuario getUsuario(Long id) {
		try {
			
			
			return db.findOne(id);
			
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
