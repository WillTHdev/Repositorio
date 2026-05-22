import webbrowser

chrome = webbrowser.get()

links = [
    "https://www.google.com",
    "https://www.youtube.com"
]

controller = 1

while controller < 5:
    controller += 1

    for link in links:
        chrome.open(
            link
        )
