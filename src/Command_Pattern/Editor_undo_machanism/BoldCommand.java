package Command_Pattern.Editor_undo_machanism;

public class BoldCommand implements UndoableCommand {

    private String prevContent;
    private HtmlDocument document;
    private History history;

    public BoldCommand(HtmlDocument document, History history) {
        this.document = document;
        this.history = history;
    }

    @Override
    public void UnExecute() {

        document.setContent(prevContent);

    }

    @Override
    public void execute() {

        prevContent = document.getContent();
        document.makeBold();
        history.push(this);

    }
}
