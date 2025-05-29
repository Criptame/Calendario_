package com.mantenimiento.calendario.Service;

import com.mantenimiento.calendario.Model.Evento;
import com.mantenimiento.calendario.Repository.EventoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EventoService {

    private final EventoRepository eventoRepository;

    public List<Evento> obtenerTodos() {
        return eventoRepository.findAll();
    }

    public List<Evento> obtenerEntreFechas(LocalDate inicio, LocalDate fin) {
        return eventoRepository.findByFechaBetween(inicio, fin);
    }

    public Evento guardar(Evento evento) {
        return eventoRepository.save(evento);
    }
}
