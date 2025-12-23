const { app, BrowserWindow, ipcMain } = require('electron');
const path = require('path');

function createWindow() {
    const win = new BrowserWindow({
        width: 400,
        height: 600,
        frame: false,
        transparent: true,
        webPreferences: {
            nodeIntegration: true,
            contextIsolation: false,
        },
    });

    win.loadFile('index.html');
}

app.whenReady().then(createWindow);

ipcMain.on('get-cpu-usage', (event) => {
    // Simulate system monitoring
    const usage = Math.random() * 100;
    event.reply('cpu-usage', usage.toFixed(2));
});

app.on('window-all-closed', () => {
    if (process.platform !== 'darwin') app.quit();
});
