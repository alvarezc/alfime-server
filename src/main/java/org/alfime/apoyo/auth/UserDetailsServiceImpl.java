package org.alfime.apoyo.auth;

import org.alfime.apoyo.domain.Asociado;
import org.alfime.apoyo.domain.AsociadoRepository;
import org.alfime.apoyo.domain.Rol;
import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private AsociadoRepository asociadoRepository;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String usuario) throws UsernameNotFoundException {
        Asociado user = asociadoRepository.findByUsuario(usuario);

        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        for (Rol role : user.getRoles()){
            grantedAuthorities.add(new SimpleGrantedAuthority(role.getNombre()));
        }

        return new org.springframework.security.core.userdetails.User(user.getUsuario(), user.getPassword(), grantedAuthorities);
    }
}
