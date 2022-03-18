import sys
from PySide6.QtWidgets import (QApplication, QLabel, QGridLayout, QLineEdit,
                               QTextEdit, QWidget)

def run_window(Widget: QWidget):
    # Initialize the app object
    app = QApplication(sys.argv)

    # Initialize and show the widget
    window = Widget()
    window.show()

    # Execute the widget and leave
    sys.exit(app.exec())

class MainWindow(QWidget):
    def __init__(self, parent=None):
        super().__init__(parent)

if __name__ == "__main__":
    run_window(MainWindow)

