package unlp.ar.oo.ejercicio1.impl;

import unlp.ar.oo.ejercicio1.WallPost;

/**
 * Completar esta clase de acuerdo a lo especificado en el cuadernillo
 *
 */
public class WallPostImpl implements WallPost {

	/**
	 * Complete con su implementación
	 */
	private int likes;
	private String text;
	private boolean isFeatured;

	public WallPostImpl() {
		this.likes = 0;
		this.isFeatured = false;
		this.text = "Undefined post";
	}

	public String getText() {
		return text;
	}

	public void setText(String descriptionText) {
		this.text = descriptionText;
	}

	public int getLikes() {
		return likes;
	}

	private void addLike() {
		this.likes += 1;
	}

	@Override
	public void like() {
		this.addLike();
	}

	private void removeLike() {
		if (this.getLikes() > 0) {
			this.likes -= 1;
		};
	}

	@Override
	public void dislike() {
		this.removeLike();
	}


	@Override
	public void toggleFeatured() {
		this.isFeatured = !this.isFeatured;
	}

	public boolean isFeatured() {
		return this.isFeatured;
	}

	/*
	 * Este mensaje se utiliza para que una instancia de Wallpost se muestre de forma adecuada
	 */
    @Override
    public String toString() {
        return "WallPost {" +
            "text: " + getText() +
            ", likes: '" + getLikes() + "'" +
            ", featured: '" + isFeatured() + "'" +
            "}";
    }

}
