package com.technicaltestpinapp.mapper;

import com.technicaltestpinapp.dto.ClienteDto;
import com.technicaltestpinapp.dto.ClienteResponseMuerte;
import com.technicaltestpinapp.model.Cliente;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-01-29T09:50:59-0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.12 (Azul Systems, Inc.)"
)
public class ClienteMapperImpl implements ClienteMapper {

    @Override
    public ClienteDto toDto(Cliente clienteEntity) {
        if ( clienteEntity == null ) {
            return null;
        }

        ClienteDto clienteDto = new ClienteDto();

        clienteDto.setNombre( clienteEntity.getNombre() );
        clienteDto.setApellido( clienteEntity.getApellido() );
        clienteDto.setFechaNacimiento( clienteEntity.getFechaNacimiento() );
        clienteDto.setGenero( clienteEntity.getGenero() );
        clienteDto.setAltura( clienteEntity.getAltura() );
        clienteDto.setPeso( clienteEntity.getPeso() );
        clienteDto.setFumador( clienteEntity.isFumador() );

        return clienteDto;
    }

    @Override
    public Cliente toEntity(ClienteDto clienteDto) {
        if ( clienteDto == null ) {
            return null;
        }

        Cliente cliente = new Cliente();

        cliente.setNombre( clienteDto.getNombre() );
        cliente.setApellido( clienteDto.getApellido() );
        cliente.setFechaNacimiento( clienteDto.getFechaNacimiento() );
        cliente.setGenero( clienteDto.getGenero() );
        cliente.setFumador( clienteDto.isFumador() );
        if ( clienteDto.getPeso() != null ) {
            cliente.setPeso( clienteDto.getPeso() );
        }
        if ( clienteDto.getAltura() != null ) {
            cliente.setAltura( clienteDto.getAltura() );
        }

        return cliente;
    }

    @Override
    public ClienteResponseMuerte clienteToClienteResonseMuerte(Cliente cliente) {
        if ( cliente == null ) {
            return null;
        }

        ClienteResponseMuerte clienteResponseMuerte = new ClienteResponseMuerte();

        clienteResponseMuerte.setNombre( cliente.getNombre() );
        clienteResponseMuerte.setApellido( cliente.getApellido() );
        clienteResponseMuerte.setFechaNacimiento( cliente.getFechaNacimiento() );
        clienteResponseMuerte.setGenero( cliente.getGenero() );
        clienteResponseMuerte.setAltura( cliente.getAltura() );
        clienteResponseMuerte.setPeso( cliente.getPeso() );
        clienteResponseMuerte.setFumador( cliente.isFumador() );
        clienteResponseMuerte.setEdad( cliente.getEdad() );

        return clienteResponseMuerte;
    }
}
