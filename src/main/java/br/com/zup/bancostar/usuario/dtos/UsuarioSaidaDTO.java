package br.com.zup.bancostar.usuario.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@NoArgsConstructor
@Setter
@Getter
public class UsuarioSaidaDTO {
    @CPF
    private String cpf;
    @Size(min = 4, max = 100, message = "{validacao.nome.size}")
    @NotBlank(message = "{validacao.obrigatorio}")
    private String nome;
    @Email
    private String email;
    private String telefone;
    private String tipoPessoa;

}
