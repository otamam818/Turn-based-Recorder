import sys
from PySide6.QtWidgets import (QApplication, QLabel, QGridLayout, QHBoxLayout,
                               QLineEdit, QTextEdit, QWidget)

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

        layout = QHBoxLayout()
        self.title_label = QLabel("Turn-based Recorder")
        layout.addWidget(self.title_label)
        self.setLayout(layout)
        self.resize(800, 800)

if __name__ == "__main__":
    run_window(MainWindow)

