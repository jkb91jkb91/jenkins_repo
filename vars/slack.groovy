def message(successOrFail) {
    if (successOrFail == 'success') {
        message = "SUCCESS BUILD"
        usedColor = '#00FF00'
    } else {
        message = 'FAILURE BUILD'
        usedColor = '#FF0000'
    }
    slackSend (color: "${usedColor}", message: "${message}")
}

