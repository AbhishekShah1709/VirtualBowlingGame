/* ControlDeskObserver.java
 *
 *  Version
 *  $Id$
 * 
 *  Revisions:
 * 		$Log$
 * 
 */

/**
 * Interface for classes that observe control desk events
 *
 */

public interface ControlDeskObserver {

	public void receiveControlDeskEvent(ControlDeskEvent ce);

    default void subscribe(ControlDesk ControlDesk) {
        ControlDesk.subscribers.add(this);
    }
}
