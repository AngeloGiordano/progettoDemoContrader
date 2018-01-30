package com.example.demo.Converter;

import com.example.demo.Dto.MovimentoDTO;
import com.example.demo.Model.Movimento;
import org.springframework.stereotype.Component;

@Component
public class MovimentoConverter implements Converter<Movimento, MovimentoDTO>{

    @Override
    public Movimento convertToEntity(MovimentoDTO movimentoDTO) {

        Movimento movimento = new Movimento();
        movimento.setData(movimentoDTO.getData());
        movimento.setCausale(movimentoDTO.getCausale());
        movimento.setImporto(movimentoDTO.getImporto());
        movimento.setMittente(movimentoDTO.getMittente());
        movimento.setBeneficiario(movimentoDTO.getBeneficiario());
        movimento.setValuta(movimentoDTO.getBeneficiario());
        return movimento;
    }


    @Override
    public MovimentoDTO convertToDTO(Movimento movimento) {
        return new MovimentoDTO(movimento.getData(), movimento.getCausale(),movimento.getImporto(),
                movimento.getMittente(),movimento.getBeneficiario(),movimento.getValuta());
    }
}
