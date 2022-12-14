package noctem.purchaseService.global.security.auth;

import lombok.Getter;
import noctem.purchaseService.global.security.dto.ClientInfoDto;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Getter
public class UserDetailsImpl implements UserDetails {
    private String email;
    private String password;
    private final ClientInfoDto clientInfoDto;
    private final List<GrantedAuthority> authorities;

    public UserDetailsImpl(ClientInfoDto clientInfoDto, Collection<? extends GrantedAuthority> authorities) {
        this.clientInfoDto = clientInfoDto;
        this.authorities = (List<GrantedAuthority>) authorities;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
