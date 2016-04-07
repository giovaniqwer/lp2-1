package br.com.herbertrausch.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.herbertrausch.domain.Cliente;
import br.com.herbertrausch.domain.ClienteService;
import br.com.herbertrausch.domain.Response;
import br.com.herbertrausch.domain.Usuario;
import br.com.herbertrausch.domain.UsuarioService;

@Path("/usuarios")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class UsuarioResource {
	public UsuarioService usuarioService = new UsuarioService();
	
	@GET
	public List<Usuario> get() {
		List<Usuario> usuarios = usuarioService.getUsuario();
		return usuarios;
	}
	
	@GET
	@Path("{id}")
	public Usuario get(@PathParam("id") long id) {
		Usuario u = usuarioService.getUsuario(id);
		return u;
	}
	
	@GET
	@Path("/nome/{nome}")
	public List<Usuario> getByNome(@PathParam("nome") String nome) {
		List<Usuario> usuarios = usuarioService.getByNome(nome);
		return usuarios;
	}
	@GET
	@Path("/senha/{senha}")
	public List<Usuario> getBySenha(@PathParam("senha") String senha) {
		List<Usuario> usuarios = usuarioService.getBySenha(senha);
		return usuarios;
	}
	


}
