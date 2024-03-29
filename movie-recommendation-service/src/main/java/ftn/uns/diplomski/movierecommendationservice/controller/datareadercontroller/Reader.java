package ftn.uns.diplomski.movierecommendationservice.controller.datareadercontroller;

/**
 * The Reader interface specifies methods for how files containing info for different classes are to be read. These
 * classes are implemented elsewhere
 *
 * @author Sefa Oduncuoglu
 */
public interface Reader {

    void readFile(String filename);

    void createObjects(String info);
}

