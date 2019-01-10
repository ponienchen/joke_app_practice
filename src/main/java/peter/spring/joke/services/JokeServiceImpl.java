package peter.spring.joke.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    // By setting up the constructor in this way, this class will be
    // created exactly once.
    // The "final" qualifier will ensure this variable is initialized exactly once
    // even if this class is called multiple times.
    private final ChuckNorrisQuotes chuckNorrisQuotes;
    public JokeServiceImpl() {
        // Here, we don't want Spring to manage this as a bean for as, and therefore
        // we are not using dependency injection and this is not a constructor-based
        // dependency injection.
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return this.chuckNorrisQuotes.getRandomQuote();
    }
}
