import sys
from PySide6.QtWidgets import (QApplication, QLabel, QGridLayout, QLineEdit,
                               QTextEdit, QWidget)

def run_window(Widget: QWidget):
    app = QApplication(sys.argv)

    window = Widget()
    window.show()

    sys.exit(app.exec())

class MainWindow(QWidget):
    def __init__(self, parent=None):
        super().__init__(parent)

if __name__ == "__main__":
    run_window(MainWindow)

