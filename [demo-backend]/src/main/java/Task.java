
// application of LinkedList because of data manipulation, edit, add, remove
// isComplet()
// isNew()
// inProgress()
// pojo>?>????????./>?>?>?


public class Task {

private String title;
private int id;
private Boolean isComplete;
private Boolean inProgress;
private Boolean isNew;

        public Task(String title, int id, Boolean isComplete, Boolean inProgress, Boolean isNew) {
                this.title = title;
                this.id = id;
                this.isComplete = isComplete;
                this.inProgress = inProgress;
                this.isNew = isNew;
        }

        public String getTitle() {
                return title;
        }

        public void setTitle(String title) {
                this.title = title;
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public Boolean getComplete() {
                return isComplete;
        }

        public void setComplete(Boolean complete) {
                isComplete = complete;
        }

        public Boolean getInProgress() {
                return inProgress;
        }

        public void setInProgress(Boolean inProgress) {
                this.inProgress = inProgress;
        }

        public Boolean getNew() {
                return isNew;
        }

        public void setNew(Boolean aNew) {
                isNew = aNew;
        }

        @Override
        public String toString() {
                return "Task{" +
                        "title='" + title + '\'' +
                        ", id=" + id +
                        ", isComplete=" + isComplete +
                        ", inProgress=" + inProgress +
                        ", isNew=" + isNew +
                        '}';
        }
}

