package finki.ukim.mk.macedonian_heritage.services;

import finki.ukim.mk.macedonian_heritage.model.Objects;

import java.util.List;
import java.util.Optional;

public interface ObjectsServices {
    public List<Objects> findAllObjects();

    public Optional<Objects> findById(Long id);
    public List<Objects> findByCategory(String category);

}
