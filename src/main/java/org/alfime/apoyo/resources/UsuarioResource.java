package org.alfime.apoyo.resources;

import org.alfime.apoyo.domain.Usuario;
import org.alfime.apoyo.domain.UsuarioRepository;
import org.alfime.apoyo.exceptions.UsuarioNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
public class UsuarioResource {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/usuarios")
    public List<Usuario> retrieveAllUsuarios() {
        return usuarioRepository.findAll();
    }

    @GetMapping("/usuarios/{id}")
    public Usuario retrieveUsuario(@PathVariable int id) throws UsuarioNotFoundException {
        Optional<Usuario> usuario = usuarioRepository.findById(id);

        if (!usuario.isPresent())
            throw new UsuarioNotFoundException("id-" + id);

        return usuario.get();
    }

    @PostMapping("/usuarios")
    public ResponseEntity<Object> createStudent(@RequestBody Usuario usuario) {
        Usuario savedUsuario = usuarioRepository.save(usuario);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedUsuario.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

    @PutMapping("/usuarios/{id}")
    public ResponseEntity<Object> updateStudent(@RequestBody Usuario usuario, @PathVariable int id) {

        Optional<Usuario> studentOptional = usuarioRepository.findById(id);

        if (!studentOptional.isPresent())
            return ResponseEntity.notFound().build();

        usuario.setId(id);

        usuarioRepository.save(usuario);

        return ResponseEntity.noContent().build();
    }
}
