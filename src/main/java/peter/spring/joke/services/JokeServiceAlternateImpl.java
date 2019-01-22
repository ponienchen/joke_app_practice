package peter.spring.joke.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class JokeServiceAlternateImpl implements JokeService {

    private ChuckNorrisQuotes chuckNorrisQuotesAlternate;

    public JokeServiceAlternateImpl(ChuckNorrisQuotes chuckNorrisQuotesAlternate) {
        this.chuckNorrisQuotesAlternate = chuckNorrisQuotesAlternate;
    }

    @Override
    public String getJoke() {
        return "(Alternate) " + this.chuckNorrisQuotesAlternate.getRandomQuote();
    }
}
